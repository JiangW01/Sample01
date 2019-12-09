# 是时候放弃shape、selector XML写法，一行代码搞定基本UI需求
> 我们在写项目的时候，总是会写很多的shape.xml文件、selector.xml文件，虽然不难，但是有时候还是挺烦的，有很多很多的xml文件，增大apk不说，主要是写起来还是挺烦的（个人觉得）。所以写了个代码方式去实现。

## 效果
[![](https://github.com/JiangW01/Sample01/blob/master/images/device-2019-12-09-155520.png)](https://github.com/JiangW01/Sample01/blob/master/images/device-2019-12-09-155520.png)
![](https://github.com/JiangW01/Sample01/blob/master/images/device-2019-12-09-161309.png)

## 使用
### 1.1 矩形
```
rectFill.rect(getResColor(R.color.fillColor))
```
### 1.2 带边框的矩形
```
rectFillAndStroke.rect(getResColor(R.color.fillColor), dpToPx(3f),getResColor(R.color.strokeColor))rectFill.rect(getResColor(R.color.fillColor))
```
### 1.3 圆角矩形
```
roundRectWithStroke.roundRect(getResColor(R.color.fillColor),cornerRadius = dpToPx2(10f),    strokeWidth = dpToPx(3f),strokeColor = getResColor(R.color.strokeColor))
```
### 1.4 圆角矩形（四个角不同）
```
roundRect5.roundRect(getResColor(R.color.fillColor),dpToPx(3f),getResColor(R.color.strokeColor),
            leftTopCornerRadiusX = dpToPx2(10f),leftTopCornerRadiusY = dpToPx2(5f),
            rightTopCornerRadiusX = dpToPx2(5f),rightTopCornerRadiusY = dpToPx2(10f),
            leftBottomCornerRadiusX = dpToPx2(10f),leftBottomCornerRadiusY = dpToPx2(20f),
            rightBottomCornerRadiusX = dpToPx2(8f),rightBottomCornerRadiusY = dpToPx2(14f))
```
### 1.5 椭圆
```
ovelRect1.ovel(getResColor(R.color.fillColor), 
cornerRadiusX = dpToPx2(50f), cornerRadiusY = dpToPx2(30f),
strokeWidth = dpToPx(3f),strokeColor = getResColor(R.color.strokeColor))
```
### 1.6 渐变
```
val gradientColors = intArrayOf(Color.YELLOW,Color.BLUE,Color.GREEN)
gradient.gradient(gradientColors)
gradient1.gradient(gradientColors,GradientDrawable.Orientation.LEFT_RIGHT)
gradient2.gradient(gradientColors,GradientDrawable.Orientation.BL_TR)
```
### 2.1 点击状态
##### 背景

```
val pressedDrawable = buildDrawable(Color.parseColor("#8B9EB3"), dpToPx2(5f))
val normalDrawable = buildDrawable(Color.parseColor("#4498F2"), dpToPx2(5f))
btnPressed.pressed(normalDrawable,pressedDrawable)
```
##### 文字颜色

```
btnPressed.pressedTextColor(Color.WHITE,Color.GRAY)
```
### 2.2 enable状态
##### 背景

```
val normalDrawable = buildDrawable(Color.parseColor("#4498F2"), dpToPx2(5f))
val unenableDrawable = buildDrawable(Color.parseColor("#A8A9AC"), dpToPx2(10f))
btnUnenable.enable(normalDrawable,unenableDrawable,false)
```
##### 文字颜色

```
btnUnenable.enabledTextColor(Color.WHITE,Color.GRAY,false)
```
### 2.3 多状态叠加
##### 背景

```
val pressedDrawable = buildDrawable(Color.parseColor("#8B9EB3"), dpToPx2(5f))
val normalDrawable = buildDrawable(Color.parseColor("#4498F2"), dpToPx2(5f))
val unenableDrawable = buildDrawable(Color.parseColor("#A8A9AC"), dpToPx2(10f))
val sd = buildStateListDrawable()    
          .pressed(pressedDrawable)   
          .enable(unenableDrawable,false)   
          .normal(normalDrawable)
btnMuilti.setStateDrawable(sd)
```
##### 文字颜色

```
val colorState = ColorStateBuilder()    
                    .enableTextColor(Color.GRAY,false)    
                    .pressedTextColor(Color.LTGRAY)    
                    .normalTextColor(Color.WHITE)    
                    .build()
btnMuilti.setTextColor(colorState)
```
### 2.4 imageview图标状态
##### 点击变换不同图标

```
iv_back.pressed(R.drawable.back,R.drawable.back_pressed)
```
##### enable不同图标

```
iv_back.enable(R.drawable.back,R.drawable.back_pressed,false)
```
### 2.5 radiobutton、checkbox图标状态
##### radiobutton

```
radioButton.checkedTextColor(Color.parseColor("#bfbfbf"),Color.parseColor("#1296db"))
radioButton.leftCheckedCompoundDrawable(R.drawable.ic_radio_normal,R.drawable.ic_radiobutton_checked)
```
##### checkbox

```
checkBox2.checkedTextColor(Color.parseColor("#bfbfbf"),Color.parseColor("#1296db"))
checkBox2.leftCheckedCompoundDrawable(R.drawable.checkbox_unchecked,R.drawable.checkbox_checked)
```


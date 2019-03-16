# Android 自定义View的绘制

## Android的UI管理层级关系
   i[android view](./activity_ui.png)

    PhoneWindow是Android系统中最基本的窗口系统，每个Activity会创建一个；  
    DecorView本质是一个FrameLayout，是所有View的祖先；
    ViewGroup是View的集合

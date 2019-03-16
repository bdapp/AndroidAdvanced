# Android触摸事件

## 触摸事件的类型
   1. ACTION_DOWN
   2. ACTION_MOVE
   3. ACTION_UP
   
## 触摸事件传递的三个阶段
   
   1. 分发 (`dispatchTouchEvent`)
```
      public boolean dispatchTouchEvent(MotionEvent event)
      
      * 当返回true时，事件被当前视图消费，不再继续分发子视图
```


   2. 拦截 (`onInterceptTouchEvent`)
```
      public boolean onInterceptTouchEvent(MotionEvent event)
      
      * 这个方法只存在于ViewGroup及其子类中
      * 当返回true时，事件被当前视图消费，不再继续分发子视图
```


   3. 消费 (`onTouchEvent`)
```
      public boolean onTouchEvent(MotionEvent event)
      
      * 当返回true时，事件被当前视图消费，不再继续分发子视图
```  
    
Activity、View、ViewGroup的事件传递：

    Activity、View的传递: dispatchTouchEvent, onTouchEvent
    
    ViewGroup的传递: dispatchTouchEvent, onInterceptTouchEvent, onTouchEvent

当onTouch和onClick共存时，先执行onTouch再执行onClick，  
如果onTouch返回true，则事件不会向下传递，也不调用onClick。

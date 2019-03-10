# Android触摸事件

## 触摸事件的类型
   1. ACTION_DOWN
   2. ACTION_MOVE
   3. ACTION_UP
   
## 触摸事件传递的三个阶段
   1. 分发 (`dispatchTouchEvent`)
   2. 拦截 (`onInterceptTouchEvent`)
   3. 消费 (`OnTouchEvent`)
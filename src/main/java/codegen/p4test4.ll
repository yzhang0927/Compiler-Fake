@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1

define i32 @main() #0 {
entry:
  %call0 = call i32 @fib(i32 4)
  %call1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %call0)
  ret i32 0
}
declare i32 @printf(i8*, ...)

define i32 @fib(i32 %x) {
entry:
  %x.addr = alloca i32, align 4
  store i32 %x, i32* %x.addr, align 4
  %0 = load i32, i32* %x.addr, align 4
  %ifcmp0 = icmp sgt i32 %0, 1
  br i1 %ifcmp0, label %if.then0, label %if.else0
if.then0: 
  %op0 = sub nsw i32 %0, 1
  %call0 = call i32 @fib(i32 %op0)
  %op1 = add nsw i32 %call0, %0
  ret i32 %op1
if.else0: 
  %1 = load i32, i32* %x.addr, align 4
  ret i32 %1
if.end0:
  ret i32 0
}

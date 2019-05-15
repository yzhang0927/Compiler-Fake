@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
define i32 @main() #0 {
entry:
  %s = alloca i32, align 4
  store i32 10, i32* %s, align 4
  %0 = load i32, i32* %s, align 4
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %0)
  %1 = load i32, i32* %s, align 4
  %cmp0 = icmp sgt i32 %1, 10
  br i1 %cmp0, label %if.then0, label %if.else0
if.then0: 
  %op0 = add nsw i32 %1, 2
  store i32 %op0, i32* %s, align 4
  br label %if.end
if.else0:
  %2 = load i32, i32* %s, align 4
  %cmp1 = icmp slt i32 %2, 8
  br i1 %cmp1, label %if.then1, label %if.else1
if.then1: 
  %op1 = sub nsw i32 %2, 3
  store i32 %op1, i32* %s, align 4
  br label %if.end
if.else1: 
  %3 = load i32, i32* %s, align 4
  %op2 = sub nsw i32 %3, 1
  store i32 %op2, i32* %s, align 4
  br label %if.end
if.end:
  %call1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %3)
  %5 = load i32, i32* %s, align 4
  %call2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %5)
  %6 = load i32, i32* %s, align 4
  %op3 = add nsw i32 %6, 2
  store i32 %op3, i32* %s, align 4
  ret i32 0
}
declare i32 @printf(i8*, ...)

@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
@s = global i32 0, align 4

define i32 @main() #0 {
entry:
  store i32 10, i32* @s, align 4
  %0 = load i32, i32* @s, align 4
  %cmp0 = icmp sgt i32 %0, 5
  br i1 %cmp0, label %if.then0, label %if.else0
if.then0: 
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 1)
  br label %if.end
if.else0:
  %1 = load i32, i32* @s, align 4
  %cmp1 = icmp slt i32 %1, 10
  br i1 %cmp1, label %if.then1, label %if.else1
if.then1: 
  %call1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 2)
  br label %if.end
if.else1: 
  %call2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 3)
  br label %if.end
if.end:
  %call3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 1)
  %call4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 2)
  %call5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 3)
  %3 = load i32, i32* @s, align 4
  %call6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %3)
  %4 = load i32, i32* @s, align 4
  %call7 = call i32 @f(i32 %4)
  %call8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %call7)
  ret i32 0
}
declare i32 @printf(i8*, ...)

define i32 @f(i32 %t) {
entry:
  %t.addr = alloca i32, align 4
  store i32 %t, i32* %t.addr, align 4
  %b = alloca i32, align 4
  %s = alloca i32, align 4
  %0 = load i32, i32* %s, align 4
  %op0 = add nsw i32 %0, 2
  store i32 %op0, i32* %s, align 4
  store i32 4, i32* %b, align 4
  %1 = load i32, i32* %b, align 4
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %1)
  %2 = load i32, i32* %t.addr, align 4
  %op1 = add nsw i32 %2, 3
  ret i32 %op1
}

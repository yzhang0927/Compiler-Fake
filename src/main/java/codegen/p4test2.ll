@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
@s = global i32 0, align 4

define i32 @main() #0 {
entry:
  store i32 10, i32* @s, align 4
  %0 = load i32, i32* @s, align 4
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %0)
  %1 = load i32, i32* @s, align 4
  %call1 = call i32 @f(i32 %1)
  %call2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %call1)
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

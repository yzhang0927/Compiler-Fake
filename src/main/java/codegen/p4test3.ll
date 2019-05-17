@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
  @a = common global [10 x i32] zeroinitializer, align 16
  @b = common global [20 x i32] zeroinitializer, align 16
@x = global i32 0, align 4
@i = global i32 0, align 4

define i32 @main() #0 {
entry:
  store i32 35, i32* @i, align 4
  store i32 3, i32* getelementptr inbounds ([10 x i32], [10 x i32]* @a, i64 0, i64 4), align 16
  store i32 0, i32* @x, align 4
  %0 = load i32, i32* getelementptr inbounds ([10 x i32], [10 x i32]* @a, i64 0, i64 4), align 4
  store i32 %0, i32* @x, align 4
  %1 = load i32, i32* @x, align 4
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %1)
  ret i32 0
}
declare i32 @printf(i8*, ...)

@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
@a = global i32 0, align 4
@i = global i32 0, align 4
@j = global i32 0, align 4

define i32 @main() #0 {
entry:
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 19)
  store i32 14, i32* @i, align 4
  store i32 49, i32* @j, align 4
  store i32 22, i32* @a, align 4
  %0 = load i32, i32* @j, align 4
  %op0 = add nsw i32 %0, 3
  store i32 %op0, i32* @j, align 4
  %1 = load i32, i32* @j, align 4
  %call1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %1)
  ret i32 0
}
declare i32 @printf(i8*, ...)

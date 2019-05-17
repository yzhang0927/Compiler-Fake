@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
@i = global i32 0, align 4
@j = global i32 0, align 4
@k = global i32 0, align 4

define i32 @main() #0 {
entry:
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 23)
  %call1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 19)
  store i32 14, i32* @i, align 4
  store i32 49, i32* @j, align 4
  %0 = load i32, i32* @j, align 4
  %op0 = add nsw i32 %0, 3
  store i32 %op0, i32* @j, align 4
  %1 = load i32, i32* @j, align 4
  %2 = load i32, i32* @i, align 4
  %op1 = add nsw i32 %1, %2
  %op2 = add nsw i32 %op1, 3
  store i32 %op2, i32* @k, align 4
  %3 = load i32, i32* @k, align 4
  %call2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %3)
  ret i32 0
}
declare i32 @printf(i8*, ...)

@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
@a = global i32 0, align 4
@b = global i32 0, align 4
@tp = common global [2 x i32] zeroinitializer, align 16

define i32 @main() #0 {
entry:
  store i32 2, i32* getelementptr inbounds ([2 x i32], [2 x i32]* @tp, i64 0, i64 0), align 16
  store i32 3, i32* getelementptr inbounds ([2 x i32], [2 x i32]* @tp, i64 0, i64 1), align 16
  %arrayidx0 = getelementptr inbounds [2 x i32], [2 x i32]* @tp, i64 0, i64 0
  %0 = load i32, i32* %arrayidx0
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %0)
  %arrayidx1 = getelementptr inbounds [2 x i32], [2 x i32]* @tp, i64 0, i64 1
  %1 = load i32, i32* %arrayidx1
  %call1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %1)
  store i32 4, i32* getelementptr inbounds ([2 x i32], [2 x i32]* @tp, i64 0, i64 0), align 16
  store i32 5, i32* getelementptr inbounds ([2 x i32], [2 x i32]* @tp, i64 0, i64 1), align 16
  %arrayidx2 = getelementptr inbounds [2 x i32], [2 x i32]* @tp, i64 0, i64 0
  %2 = load i32, i32* %arrayidx2
  %call2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %2)
  %arrayidx3 = getelementptr inbounds [2 x i32], [2 x i32]* @tp, i64 0, i64 1
  %3 = load i32, i32* %arrayidx3
  %call3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %3)
  store i32 0, i32* @a, align 4
  store i32 0, i32* @b, align 4
  %4 = load i32, i32* getelementptr inbounds ([2 x i32], [2 x i32]* @tp, i64 0, i64 0), align 4
  %5 = load i32, i32* getelementptr inbounds ([2 x i32], [2 x i32]* @tp, i64 0, i64 1), align 4
  %6 = load i32, i32* getelementptr inbounds ([2 x i32], [2 x i32]* @tp, i64 0, i64 0), align 4
  store i32 %6, i32* @b, align 4
  %7 = load i32, i32* getelementptr inbounds ([2 x i32], [2 x i32]* @tp, i64 0, i64 1), align 4
  store i32 %7, i32* @b, align 4
  %8 = load i32, i32* @a, align 4
  %call4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %8)
  %9 = load i32, i32* @b, align 4
  %call5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %9)
  ret i32 0
}
declare i32 @printf(i8*, ...)

@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
  @a = common global [10 x i32], align 16
  @b = common global [20 x i32], align 16
@i = global i32 0, align 4

define i32 @main() #0 {
entry:
  store i32 35, i32* @i, align 4
  store i32 3, i32* getelementptr inbounds ([10 x i32], [10 x i32]* @a, i64 0, i64 0), align 16
  ret i32 0
}

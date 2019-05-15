@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
@i = global i32 0, align 4

define i32 @main() #0 {
entry:
  store i32 35, i32* @i, align 4
  ret i32 0
}

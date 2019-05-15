@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
  @b = common global [100 x i32], align 16
  @c = common global [100 x i32], align 16
@k = global i32 0, align 4

define i32 @main() #0 {
entry:
  store i32 567, i32* @k, align 4
  %call0 = call i32 @f(i32 null)
  store i32 %call0, i32* @k, align 4
  %call1 = call i32 @ff(i32 2)
  store i32 %call1, i32* @k, align 4
  ret i32 0
}

define i32 @f(i32 %a) {
entry:
  %a.addr = alloca i32, align 4
  store i32 %a, i32* %a.addr, align 4
  %0 = load i32, i32* %a.addr, align 4
  ret i32 %0
}

define i32 @ff(i32 %a) {
entry:
  %a.addr = alloca i32, align 4
  store i32 %a, i32* %a.addr, align 4
  %k = alloca i32, align 4
  %0 = load i32, i32* %k, align 4
  %1 = load i32, i32* %a.addr, align 4
  %op0 = add nsw i32 %0, %1
  ret i32 %op0
}

define i32 @ffff(i32 %a) {
entry:
  %a.addr = alloca i32, align 4
  store i32 %a, i32* %a.addr, align 4
 %$tmp0 = alloca i32, align 4
  store i32 %0, i32* %$tmp0, align 4
  %1 = load i32, i32* %a.addr, align 4
  ret i32 %1
}

@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00", align 1

; Function Attrs: noinline nounwind optnone ssp uwtable

define i32 @simpleAdd(i32 %a) #0 {
entry:
  %a.addr = alloca i32, align 4
  store i32 %a, i32* %a.addr, align 4
  %0 = load i32, i32* %a.addr, align 4
  %add = add nsw i32 %0, 1
  ret i32 %add
}

; Function Attrs: noinline nounwind optnone ssp uwtable
define i32 @main() #0 {
entry:
  %s = alloca i32, align 4
  %v = alloca i32, align 4
  %k = alloca i32, align 4
  store i32 -1, i32* %s, align 4
  %0 = load i32, i32* %s, align 4
  store i32 %0, i32* %v, align 4
  %1 = load i32, i32* %s, align 4
  %call = call i32 @simpleAdd(i32 %1)
  store i32 %call, i32* %k, align 4
  %2 = load i32, i32* %k, align 4
  %call1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %2)
  %call2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 16)
  %call3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 28)
  ret i32 0
}



declare i32 @printf(i8*, ...) #1

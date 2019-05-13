; define string constant "%d\n"
@s = internal constant [4 x i8] c"%d\0A\00"
; declare C function: extern int printf(char *, ...)
declare i32 @printf(i8 *, ...)

; define main entry point like main() in a C program
define i32 @main() {
    ; get the address of 1st char of s: &s[0]
    ; reuseable for all printf calls
    %ps = getelementptr [4 x i8]* @s, i64 0, i64 0
    ; get 99 into a register; t0 = 99+0 (LLVM has no load int instruction)
    %t0 = add i32 99,0
    ; call printf with "%d\n" and t0 as arguments
    call i32 (i8 *, ...)* @printf(i8* %ps, i32 %t0)
    ret i32 0 ; return 0
}
section .data
msg     db      'morse converted: ', 0AH
len     equ     $-msg
array   TIMES   20  DW  ''

section .text
global  _start
_start: mov     edx, len
        mov     ecx, msg
        mov     ebx, 1
        mov     eax, 4
        int     80h

        mov     ebx, 0
        mov     eax, 1
        int     80h
.386
.model flat, stdcall
option casemap:none

include windows.inc
include kernel32.inc
include user32.inc
includelib kernel32.lib
includelib user32.lib

.data
    msg db "Hello, World!", 0Ah, 0Dh, 0  ; Message with newline (CRLF) and null-terminator
    msgLen equ $ - msg                   ; Length of the message
    hStdOut dd 0                          ; Handle for stdout

.code
start:
    ; Get stdout handle
    push -11                ; STD_OUTPUT_HANDLE constant
    call GetStdHandle
    mov hStdOut, eax        ; Store handle in hStdOut

    ; Write message to console
    push 0                  ; Reserved
    push 0                  ; Bytes written
    push msgLen             ; Message length
    push offset msg         ; Message address
    push hStdOut            ; Handle to console output
    call WriteConsoleA      ; Call WriteConsole API

    ; Exit process
    push 0
    call ExitProcess

end start

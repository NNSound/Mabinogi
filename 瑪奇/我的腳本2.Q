[General]
SyntaxVersion=2
BeginHotkey=121
BeginHotkeyMod=0
PauseHotkey=0
PauseHotkeyMod=0
StopHotkey=123
StopHotkeyMod=0
RunOnce=1
EnableWindow=
MacroID=43380729-56c0-4f62-988b-072319d9c8f4
Description=§Úªº¸}¥»2
Enable=0
AutoRun=0
[Repeat]
Type=0
Number=1
[SetupUI]
Type=2
QUI=
[Relative]
SetupOCXFile=
[Comment]

[Script]
Hwnd = Plugin.Window.Find("mabinogi", 0)  
Delay 500
Call Plugin.Window.Active(Hwnd)


For  40
	KeyPress "Tab", 1
	Delay 500
	KeyPress "1", 1
	Delay 4500
	
Next

[General]
SyntaxVersion=2
BeginHotkey=0
BeginHotkeyMod=0
PauseHotkey=0
PauseHotkeyMod=0
StopHotkey=123
StopHotkeyMod=0
RunOnce=1
EnableWindow=
MacroID=5192598e-14e4-430e-835c-05ea7b0b8c97
Description=完成騎士團任務
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

//下面這句將字串轉換成數值
Hwnd = Plugin.Window.Find("mabinogi", 0)  
Delay 500
Call Plugin.Window.Active(Hwnd)


Delay 1000		
KeyPress 67, 1 : Delay 1500

MoveTo 165, 75
Delay 100
LeftClick 2 : Delay 100 //點擊見習騎士團

MoveTo 340, 400
LeftClick 2 : Delay 100//點擊任務管理
Delay 1000

For 3
	MoveTo 540, 330
	Delay 100
	LeftClick 2 : Delay 300 //點擊Line1
	MoveTo 525, 470
	Delay 100
	LeftClick 2 : Delay 300//完成
	Delay 100
	
	MoveTo 720, 430
	LeftClick 2 : Delay 300//確認
	Delay 1000
	MoveTo 750, 410
	LeftClick 2 : Delay 300//確認
	Next




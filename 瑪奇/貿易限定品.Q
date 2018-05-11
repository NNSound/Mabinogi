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
MacroID=d4e5256b-e5ce-497d-898f-bf7c0e205d7d
Description=貿易限定品
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
Delay 500

Do
	//點擊NPC對話
	Delay 4000
	KeyDown "Ctrl", 1
	Delay 500
	MoveTo 1630, 400
	LeftClick 3
	KeyUp "Ctrl", 1
	Delay 1000
	
	//點擊貿易
	
	KeyPress 32, 4 : Delay 100
	Delay 100
	MoveTo 540, 945
	Delay 100
	LeftClick 1
	Delay 1000
	
	//7BC8DE
	FindColorEx 715, 670, 730, 690, "DEC87B", 0, 0.8, intX, intY
	If intX > 0 And intY > 0 Then 
		MoveTo 730, 680
		Delay 100
		LeftClick 1
		Delay 100
		
		MoveTo 1060, 645
		Delay 100
		LeftClick 1
		MessageBox "限定品更新"
		Exit Do
	End If
	
	MoveTo 1310, 685
	Delay 500
	LeftClick 1
	
	//MessageBox "例行檢查"
Loop

MessageBox "限定品跟新"

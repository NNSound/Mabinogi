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
MacroID=82811abd-7a8c-4168-af46-673d4c93f45a
Description=精武餵食_自動備份
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


While(true)
	//先觀察是否餓了
	MoveTo 1630, 400//觀查
	//MoveTo 1200, 400//觀查
	//MessageBox "1560 500"
	//(1690 685)  (1725 685)
	//(1690 750 ) (1725 750)
	Delay 3000
	FindColorEx 1740,650,1760,700,"0000FF",0,0.8,intX,intY
	If intX > 0 And intY > 0 Then 
		
		Delay 1000	
		KeyPress ",", 1
		Delay 1500
		KeyPress 32, 4 : Delay 100
		Delay 1500
		
		MoveTo 625, 950//點擊交出物品
		Delay 1500
		LeftClick 4 : Delay 100//點擊交出物品
		Delay 1500
		KeyPress 32, 4
		Delay 1500
		
		MoveTo 1575, 540 
		LeftClick 4 : Delay 100//點擊欲餵食物品
		Delay 1500
		
		
		MoveTo 1690, 655
		LeftClick 4 : Delay 100//點擊確定
		Delay 1500
		
		KeyPress ",", 1
		Delay 1500
	End If
	MoveTo 100,100
	Delay 1000 * 30
Wend

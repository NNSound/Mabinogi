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
MacroID=11d3eb59-5e85-4045-9c03-3f0e6d5a8107
Description=Freestyle Jam
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

[Attachment]
UEsDBBQAAgAIAOR4dkoduWcDLQAAAN4AAAAGABEARjEuYm1wVVQNAAdGk9JYRpPSWEaT0lhz8r3HAAFmQKwBxBxAzA7EjAwSYPEVDJjgP24Al0VTjKwLjY1fDZqNuNRjBQBQSwECFwsUAAIACADkeHZKHblnAy0AAADeAAAABgAJAAAAAAAAACAAgIEAAAAARjEuYm1wVVQFAAdGk9JYUEsFBgAAAAABAAEAPQAAAGIAAAAAAA==


[Script]
//(32Bit)，1080p，即興演奏請放置F1，循環25回後停止
Delay 2000
hd = Plugin.Window.Find(0, "新瑪奇 mabinogi")
kh = Window.GetClientRect(hd)
ac = split(kh, "|")
lx = int(ac(0)) : ly = int(ac(1)) : rx = int(ac(2)) + lx : ry = int(ac(3)) + ly
FindPic lx, ly, rx, ry, "Attachment:\F1.bmp", 1, gx, gy //找圖片
If gx > 0 Then 
	F1 = GetPixelColor(gx + 10, gy + 10)
End If

While n <= 25
	If F1 = GetPixelColor(gx + 10, gy + 10) Then
			For 5
				KeyPress "F1", 1
				Delay 1000
			Next
			n = n + 1
	End If
	
	
			
	lix = rx*0.35 : rix = rx*0.65
	FindColor lix, ly, rix, ry, "8E8C8E", Bx, By		
	If GetPixelColor(Bx+10, By)="8E8C8E" Then
		Rem A
		FindColor lix, By - 58, rix, By - 58, "FFFFFF", x, y
		If x > 0 Then
			Pc = GetPixelColor(x - 1, y)
			If Pc = "808080" Then
				KeyPress "W", 1
				lix = x + 30
			ElseIf Pc = "B0B0B0" Then
				KeyPress "S", 1
				lix = x + 25
			ElseIf Pc = "A0A0A0" Then
				KeyPress "A", 1
				lix = x + 20
			ElseIf Pc = "000000" Then
				KeyPress "D", 1
				lix = x + 35
			Else
				lix = x + 1
			End If
			Goto A
		End If
	End If
Wend

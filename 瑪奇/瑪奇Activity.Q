[General]
SyntaxVersion=2
BeginHotkey=121
BeginHotkeyMod=0
PauseHotkey=0
PauseHotkeyMod=0
StopHotkey=123
StopHotkeyMod=0
RunOnce=0
EnableWindow=
MacroID=828a3d7d-c72d-4466-a94e-831662f426eb
Description=掃地活動
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
Plugin.Bkgnd.SendString 參數1,參數2
//下面這句是遍歷符合視窗標題("記事本")的控制碼保存到陣列(HwndEx)裡
HwndEx = Plugin.Window.Search("新瑪奇 mabinogi")
//MsgBox "查找到符合的視窗控制碼為："& HwndEx
//下面這句用於分割字串,將獲得的控制碼組分割
dim MyArray
MyArray = Split(HwndEx, "|")
MsgBox "視窗數量："& UBound(MyArray)
If UBound(MyArray)>=0 Then
    For 30
    	i = 0
    	For UBound(MyArray)
        	//下面這句將字串轉換成數值
        	
        	Call Plugin.Window.Active(MyArray(i))
			Delay 1000		
			KeyPress "Enter", 1 : Delay 100
			SayString "打掃!"
			KeyPress "Enter", 2 : Delay 100
        	i=i+1
    	Next
    	Delay 1000 * 70
    Next
End If



MsgBox "腳本結束"

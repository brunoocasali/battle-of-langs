Imports System.Collections.Generic

' To run just execute:
' * ~$ vbnc MorseCode.vb
' * ~$ mono MorseCode.exe
' * author: http://github.com/brunoocasali - twitter: @brunoocasali
'         http://brunocasali.wordpress.com
'

Class MorseCode
  Private _plainText As String
	Public Property PlainText() As String
	  Get
	      Return _plainText
	  End Get
	  Set(ByVal value As String)
	      _plainText = value
	  End Set
  End Property
  
  Private _morseText As String
	Public Property MorseText() As String
	  Get
	      Return _plainText
	  End Get
	  Set(ByVal value As String)
	      _plainText = value
	  End Set
  End Property

	Sub convert()
	  Dim alphabet As New Dictionary(Of String, String)
	  alphabet.Add("a", ".-")
		alphabet.Add("b", "-...")
		alphabet.Add("c", "-.-.")
		alphabet.Add("d", "-..")
		alphabet.Add("e", ".")
		alphabet.Add("f", "..-.")
		alphabet.Add("g", "--.")
		alphabet.Add("h", "....")
		alphabet.Add("i", "..")
		alphabet.Add("j", ".---")
		alphabet.Add("k", "-.-")
		alphabet.Add("l", ".-..")
		alphabet.Add("m", "--")
		alphabet.Add("n", "-.")
		alphabet.Add("o", "---")
		alphabet.Add("p", ".--.")
		alphabet.Add("q", "--.-")
		alphabet.Add("r", ".-.")
		alphabet.Add("s", "...")
		alphabet.Add("t", "-")
		alphabet.Add("u", "..-")
		alphabet.Add("v", "...-")
		alphabet.Add("w", ".--")
		alphabet.Add("x", "-..-")
		alphabet.Add("y", "-.--")
		alphabet.Add("z", "--..")

    Dim letter As KeyValuePair(Of String, String)
		For Each letter In alphabet
			MorseText = MorseText.Replace(letter.Key, letter.Value & " ")
		Next
	End Sub
End Class


Module Start
  Sub Main()
    Dim m As MorseCode = New MorseCode()
    
		Console.WriteLine("What did you want to transform to morse code? ")
		m.PlainText = Console.ReadLine()

		m.PlainText = (If([String].IsNullOrEmpty(m.PlainText), "Hello World", m.PlainText)).ToLower()

		m.MorseText = m.PlainText
		Console.WriteLine("YOUR WORD IN PLAIN TEXT " & vbTab & " " & m.PlainText)
		m.convert()
		Console.WriteLine("YOUR WORD IN MORSE CODE " & vbTab & " " & m.MorseText)
	End Sub
End Module

<?
$teste = array('a' => '.-', 'b' => '-...', 'c' => '-.-.', 'd' => '-..',
    'e' => '.', 'f' => '..-.', 'g' => '--.', 'h' => '....', 'i' => '..',
    'j' => '.---', 'k' => '-.-', 'l' => '.-..', 'm' => '--', 'n' => '-.',
    'o' => '---', 'p' => '.--.',   'q' => '--.-', 'r' => '.-.', 's' => '...',
    't' => '-', 'u' => '..-', 'v' => '...-',   'w' => '.--', 'x' => '-..-',
    'y' => '-.--', 'z' => '--..');

$command = $argv[1];

$length = strlen($command);
$thisWordCodeVerdeeld = '';
for ($i=0; $i<$length; $i++) {
    if ( array_key_exists($command[$i], $teste) ) {
        $thisWordCodeVerdeeld .= $teste[$command[$i]];
    } else {
        $thisWordCodeVerdeeld = 'trouble in paradise';
    }
}

echo "$thisWordCodeVerdeeld\n";
?>

<?php

/*
|--------------------------------------------------------------------------
| Application Routes
|--------------------------------------------------------------------------
|
| Here is where you can register all of the routes for an application.
| It's a breeze. Simply tell Laravel the URIs it should respond to
| and give it the Closure to execute when that URI is requested.
|
*/

Route::get('/', function()
{
    return View::make('morsecode');
});

Route::post('morsecode', function()
{
    $morseData = array('a' => '.-', 'b' => '-...', 'c' => '-.-.', 'd' => '-..',
                   'e' => '.', 'f' => '..-.', 'g' => '--.', 'h' => '....', 'i' => '..',
                   'j' => '.---', 'k' => '-.-', 'l' => '.-..', 'm' => '--', 'n' => '-.',
                   'o' => '---', 'p' => '.--.',   'q' => '--.-', 'r' => '.-.', 's' => '...',
                   't' => '-', 'u' => '..-', 'v' => '...-',   'w' => '.--', 'x' => '-..-',
                   'y' => '-.--', 'z' => '--..');

    $command = Input::get('message');

    $length = strlen($command);
    $encoded = '';

    for ($i=0; $i<$length; $i++) {
        if ( array_key_exists($command[$i], $morseData) ) {
            $encoded .= $morseData[$command[$i]];
        } else {
            $encoded = 'trouble in paradise';
        }
    }
    return View::make('result')->with('code', $encoded);
});
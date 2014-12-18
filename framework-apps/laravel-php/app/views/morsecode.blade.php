
@extends('layout')

@section('content')
    {{ Form::open(array('url' => 'morsecode')) }}
    {{ Form::label('message', 'Message') }}
    {{ Form::text('message') }}
    {{ Form::submit('Encode') }}
    {{ Form::close() }}
@stop
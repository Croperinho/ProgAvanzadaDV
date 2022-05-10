<?php

class Persona{

    public $nombre
    public $apellido
    public $edad

    public function __construct($p_nombre,$p_apellido,$p_edad){

        $this->nombre = $p_nombre;
        $this->apellido = $p_apellido;
        $this->edad = $p_edad;

    }

    public function getMayorEdad(){
        if ($edad > 17){
            echo 'La persona es mayor de edad'
            return true
        }else{
            echo 'La persona es menor de edad'
            return false
        }
    }

}
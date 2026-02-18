<?php

class Solution{
    public function palindromeNumber($x){
        $arrayNumber = str_split((string) $x);
        for ($i=0; $i < (sizeof($x)/2)+1; $i++) { 
            if ($arrayNumber[$i] != $arrayNumber[sizeof($x)-1-$i]) {
                return false;
            }
        }

        return true;
    }
}

if (PHP_SAPI === 'cli') {
    $sol = new Solution();
    echo json_encode($sol->palindromeNumber(121)) . PHP_EOL;
}

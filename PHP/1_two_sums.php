<?php

class Solution {
    public function twoSum($nums, $target) {
        $map = [];
        for ($i = 0; $i < count($nums); $i++) {
            $complement = $target - $nums[$i];
            if (isset($map[$complement])) {
                return [$map[$complement], $i];
            }
            $map[$nums[$i]] = $i;
        }
        return [-1, -1];
    }
}

if (PHP_SAPI === 'cli') {
    $sol = new Solution();
    echo json_encode($sol->twoSum([2,7,11,15], 9)) . PHP_EOL;
}
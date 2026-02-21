<?php

class Solution{
    public function longestCommonPrefix($strs){
            if (empty($strs)) return "";
            sort($strs);
            $first = $strs[0];
            $last = $strs[count($strs) - 1];
            $limit = min(strlen($first), strlen($last));
            for ($i = 0; $i < $limit; $i++) {
                if ($first[$i] !== $last[$i]) {
                    return substr($first, 0, $i);
                }
            }
            return substr($first, 0, $limit);
    }
}

if (PHP_SAPI === 'cli') {
    $sol = new Solution();
    echo $sol->longestCommonPrefix(["flower", "flow", "floweight"]) . PHP_EOL;
}
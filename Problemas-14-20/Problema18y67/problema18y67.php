<?php

/** 
 * Project Euler. Solución problema número 18
 *
 * A partir de un árbol dado, hay que hayar el resultado del camino el cual tiene
 * la suma de elementos mayor.
 *
 * Se recorre el árbol empezando por abajo, se haya cual es el máx entre la suma de 
 * cada elemento con su padre, con lo cual vamos descartando un hijo de cada padre
 * hasta llegar al elemento que no tiene hijos:
 *
 * 3              23      <----- Solución (de abajo a arriba): 9 4 7 3
 * 7 4            20 19
 * 2 4 6          10 13 15
 * 8 5 9 3
 *
 */

function sumBestPath($file) {
  $f = fopen($file, 'r');
  $i = 0;
  while(!feof($f)) {
    $arr[$i] = explode(" ", fgets($f));
    $i++;
  }
  fclose($f);

  $lastRow = count($arr) - 1;
  while($lastRow > 0) {
    for($i = 0; $i < count($arr[$lastRow - 1]); $i++) {
      $arr[$lastRow - 1][$i] = max(
        $arr[$lastRow - 1][$i] + $arr[$lastRow][$i],
        $arr[$lastRow - 1][$i] + $arr[$lastRow][$i + 1]
      );
    }
    array_pop($arr);
    $lastRow--;
  }
  return $arr[0][0];
}
echo sumBestPath('triangle.txt');

?>

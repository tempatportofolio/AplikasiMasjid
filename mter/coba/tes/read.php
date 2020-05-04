<?php

require_once('config.php');

$result = array();

$query = mysqli_query($CON,"SELECT * FROM mahasiswa ORDER BY nomor_mahasiswa DESC");
while($row = mysqli_fetch_assoc($query)){
  $result[] = $row;
}

echo json_encode(array('result'=>$result));

?>

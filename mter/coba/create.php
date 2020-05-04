<?php

require_once('config.php');

$nama_mahasiswa = $_POST['nama_mahasiswa'];
$nomor_mahasiswa = $_POST['nomor_mahasiswa'];
$alamat_mahasiswa = $_POST['alamat_mahasiswa'];


if(!$nim || !$name || !$address){
  echo json_encode(array('message'=>'required field is empty.'));
}else{

  $query = mysqli_query($CON, "INSERT INTO mahasiswa VALUES ('$nama_mahasiswa','$nomor_mahasiswa','$alamat_mahasiswa')");

  if($query){
    echo json_encode(array('message'=>'student data successfully added.'));
  }else{
    echo json_encode(array('message'=>'student data failed to add.'));
  }

}

?>

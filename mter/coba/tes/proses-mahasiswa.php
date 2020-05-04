<?php
require_once('config.php');
$nomor_mahasiswa = $_POST['nomor_mahasiswa'];
$nama_mahasiswa = $_POST['nama_mahasiswa'];
$alamat_mahasiswa = $_POST['alamat_mahasiswa'];
if(!$nomor_mahasiswa || !$nama_mahasiswa || !$alamat_mahasiswa{
  echo json_encode(array('message'=>'required field is empty.'));
}else{
$query = mysqli_query($CON, "INSERT INTO mahasiswa VALUES ('$nomor_mahasiswa','$nama_mahasiswa','$alamat_mahasiswa')");
if($query){
    echo json_encode(array('message'=>'student data successfully added.'));
  }else{
    echo json_encode(array('message'=>'student data failed to add.'));
  }
}
?>
<?php

include("config.php");



$sql = "SELECT * FROM mahasiswa";
$result = array();
$query = mysqli_query($db, $sql);
 
while($row = mysqli_fetch_array($query)){
    array_push($result, array('nomor_mahasiswa' => $row['nomor_mahasiswa'],
    'nama_mahasiswa' => $row['nama_mahasiswa'], 
    'alamat_mahasiswa' => $row['alamat_mahasiswa']
));
}
echo json_encode(array("result" => $result));
?>




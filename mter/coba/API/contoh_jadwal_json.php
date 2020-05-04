<?php

include("config.php");



$sql = "SELECT * FROM jadwal_sholat";
$result = array();
$query = mysqli_query($db, $sql);
 
while($row = mysqli_fetch_array($query)){
    array_push($result, array('shubuh' => $row['shubuh'],
    'dhuhur' => $row['dhuhur'],
    'ashar' => $row['ashar'],
    'maghrib' => $row['maghrib'],
    'isha' => $row['isha'],
    'dhuha' => $row['dhuha']
));
}
echo json_encode(array("result" => $result));
?>




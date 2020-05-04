<?php

include ('config.php');

	$dhuhur = $_POST['dhuhur'];


	$sql = "UPDATE jadwal_sholat SET dhuhur='$dhuhur'";
	$query = mysqli_query($db, $sql);


	if( $query ) {

	}else {
		die("GAGAL MENYIMPAN PERUBAHAN.......");
	}



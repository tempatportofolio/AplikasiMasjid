<?php

include ('config.php');

	$dhuha = $_POST['dhuha'];


	$sql = "UPDATE jadwal_sholat SET dhuha='$dhuha'";
	$query = mysqli_query($db, $sql);


	if( $query ) {

	}else {
		die("GAGAL MENYIMPAN PERUBAHAN.......");
	}



<?php

include ('config.php');

	$ashar = $_POST['ashar'];


	$sql = "UPDATE jadwal_sholat SET ashar='$ashar'";
	$query = mysqli_query($db, $sql);


	if( $query ) {

	}else {
		die("GAGAL MENYIMPAN PERUBAHAN.......");
	}



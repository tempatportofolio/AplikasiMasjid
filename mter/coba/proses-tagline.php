<?php

include ('config.php');

	$isi_tagline = $_POST['isi_tagline'];

	$sql = "UPDATE tagline SET isi_tagline='$isi_tagline'";
	$query = mysqli_query($db, $sql);


	if( $query ) {

	}else {
		die("GAGAL MENYIMPAN PERUBAHAN.......");
	}



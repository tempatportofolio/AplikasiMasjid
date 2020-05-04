<?php

include ('config.php');

	$judul_pengumuman = $_POST['judul_pengumuman'];
	$isi_pengumuman = $_POST['isi_pengumuman'];

	$sql = "UPDATE pengumuman_masjid SET judul_pengumuman='$judul_pengumuman', isi_pengumuman='$isi_pengumuman'";
	$query = mysqli_query($db, $sql);


	if( $query ) {

	}else {
		die("GAGAL MENYIMPAN PERUBAHAN.......");
	}



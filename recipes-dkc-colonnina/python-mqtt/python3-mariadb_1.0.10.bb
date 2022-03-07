
SUMMARY = "Python MariaDB extension"
HOMEPAGE = "https://www.github.com/mariadb-corporation/mariadb-connector-python"
AUTHOR = "Georg Richter <>"
LICENSE = ""
LIC_FILES_CHKSUM = "file://LICENSE;md5=1803fa9c2c3ce8cb06b4861d75310742"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/fa/3e/406aab309101bb61cfc6745badfa3ec6c4c6f026f76b2428f597e73f7975/mariadb-1.0.10.zip"
SRC_URI[md5sum] = "919c33c9f439d3acd34a337e3a87d40a"
SRC_URI[sha256sum] = "79028ba6051173dad1ad0be7518389cab70239f92b4ff8b8813dae55c3f2c53d"

S = "${WORKDIR}/mariadb-1.0.10"

do_compile_prepend() {
	# export MARIADB_CONFIG="/usr/bin/mariadb_config"
	#opkg install mariadb-connector-c
}

do_compile[depends] = "mariadb-connector-c:do_install"

# RDEPENDS_${PN} = "mariadb-connector-c"
# RDEPENDS_${PN}_class = "mariadb-connector-c"
# RDEPENDS_${PN}_dev = "mariadb-connector-c"

DEPENDS += "mariadb-connector-c"

# DEPENDS += "python3 python3-setuptools-native"
# DEPENDS += "python3 python3-setuptools"

## questo fa in modo che si compili su host ?!?!? forse no....
# BBCLASSEXTEND = "native nativesdk"


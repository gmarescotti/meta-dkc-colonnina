
SUMMARY = "Python interface to MySQL"
HOMEPAGE = "https://github.com/PyMySQL/mysqlclient"
AUTHOR = "Inada Naoki <songofacandy@gmail.com>"
LICENSE = "GPL-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit pypi setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/de/79/d02be3cb942afda6c99ca207858847572e38146eb73a7c4bfe3bdf154626/mysqlclient-2.1.0.tar.gz"
SRC_URI[md5sum] = "999953d039775ff905f754acd70b13e2"
SRC_URI[sha256sum] = "973235686f1b720536d417bf0a0d39b4ab3d5086b2b6ad5e6752393428c02b12"

S = "${WORKDIR}/mysqlclient-2.1.0"

# DEPENDS = "mariadb-connector-c"
# RDEPENDS_${PN} = "mariadb-connector-c"
DEPENDS = "mysql-connector-python"

BBCLASSEXTEND = "native nativesdk"


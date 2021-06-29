
SUMMARY = "A non-validating SQL parser."
HOMEPAGE = "https://github.com/andialbrecht/sqlparse"
AUTHOR = "Andi Albrecht <albrecht.andi@gmail.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b136f573f5386001ea3b7b9016222fc"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/a2/54/da10f9a0235681179144a5ca02147428f955745e9393f859dec8d0d05b41/sqlparse-0.4.1.tar.gz"
SRC_URI[md5sum] = "eebbc6b5f1033054873033e54b0c1266"
SRC_URI[sha256sum] = "0f91fd2e829c44362cbcfab3e9ae12e22badaa8a29ad5ff599f9ec109f0454e8"

S = "${WORKDIR}/sqlparse-0.4.1"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"


SUMMARY = "Composable command line interface toolkit"
HOMEPAGE = "https://palletsprojects.com/p/click/"
AUTHOR = "Armin Ronacher <armin.ronacher@active-4.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=1fa98232fd645608937a0fdc82e999b8"

SRC_URI = "https://files.pythonhosted.org/packages/21/83/308a74ca1104fe1e3197d31693a7a2db67c2d4e668f20f43a2fca491f9f7/click-8.0.1.tar.gz"
SRC_URI[md5sum] = "ff66f850b8eb4dc618b405d7fe22a0c2"
SRC_URI[sha256sum] = "8c04c11192119b1ef78ea049e0a6f0463e4c48ef00a30160c704337586f3ad7a"

S = "${WORKDIR}/click-8.0.1"

RDEPENDS_${PN} = ""

inherit setuptools3

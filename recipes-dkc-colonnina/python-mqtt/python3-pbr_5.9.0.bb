
SUMMARY = "Python Build Reasonableness"
HOMEPAGE = "https://docs.openstack.org/pbr/latest/"
AUTHOR = "OpenStack <openstack-discuss@lists.openstack.org>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dece7821bf3fd70fe1309eaa37d52a2"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/96/9f/f4bc832eeb4ae723b86372277da56a5643b0ad472a95314e8f516a571bb0/pbr-5.9.0.tar.gz"
SRC_URI[md5sum] = "d3f10f44608c7fee213a6ee322c6966c"
SRC_URI[sha256sum] = "e8dca2f4b43560edef58813969f52a56cef023146cbb8931626db80e6c1c4308"

S = "${WORKDIR}/pbr-5.9.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"

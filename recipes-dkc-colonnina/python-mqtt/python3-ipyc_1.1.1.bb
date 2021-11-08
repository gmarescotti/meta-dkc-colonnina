
SUMMARY = "A basic IPC implementation for Python"
HOMEPAGE = "https://github.com/dovedevic/IPyC"
AUTHOR = "dovedevic <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ea2c839a1cde00ad2ffb9c990f90c02"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/85/81/cffc23d5487d2adcf519c5878a194d44784b9e637e1bf6616a7865195617/IPyC-1.1.1.tar.gz"
SRC_URI[md5sum] = "564cbab3fed0bef3bd17538dfaa9d658"
SRC_URI[sha256sum] = "8fbf27dc0f0ca5f79a32a25b969bca93239d1de2761420c0f907e896ae79561a"

S = "${WORKDIR}/IPyC-1.1.1"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"

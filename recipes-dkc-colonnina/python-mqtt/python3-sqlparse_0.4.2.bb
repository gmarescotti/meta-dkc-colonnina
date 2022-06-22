
SUMMARY = "A non-validating SQL parser."
HOMEPAGE = "https://github.com/andialbrecht/sqlparse"
AUTHOR = "Andi Albrecht <albrecht.andi@gmail.com>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2b136f573f5386001ea3b7b9016222fc"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/32/fe/8a8575debfd924c8160295686a7ea661107fc34d831429cce212b6442edb/sqlparse-0.4.2.tar.gz"
SRC_URI[md5sum] = "66dce30d92823589f5e5e043f90b4f16"
SRC_URI[sha256sum] = "0c00730c74263a94e5a9919ade150dfc3b19c574389985446148402998287dae"

S = "${WORKDIR}/sqlparse-0.4.2"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"


SUMMARY = "The geodesic routines from GeographicLib"
HOMEPAGE = "https://geographiclib.sourceforge.io/1.52/python"
AUTHOR = "Charles Karney <charles@karney.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=11fd331b707f0de15b3485b93dfacc82"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/22/be/13de9dddbee1cfa79fa4dcc69f9bbf4787aecb7eef90752416b5d0fe88cf/geographiclib-1.52.tar.gz"
SRC_URI[md5sum] = "d4b9a5ac870d5071c2ef08f0c1cad544"
SRC_URI[sha256sum] = "ac400d672b8954b0306bca890b088bb8ba2a757dc8133cca0b878f34b33b2740"

S = "${WORKDIR}/geographiclib-1.52"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"


SUMMARY = "The geodesic routines from GeographicLib"
HOMEPAGE = "https://geographiclib.sourceforge.io/1.50/python"
AUTHOR = "Charles Karney <charles@karney.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://setup.py;md5=443f68370f23fd15d4992ece12cb3821"

SRC_URI = "https://files.pythonhosted.org/packages/a5/b3/bac57fe2db304dc7e64e7d1597848b28b76ba5c2527c3076df091c9391f8/geographiclib-1.50.tar.gz"
SRC_URI[md5sum] = "06cb02d3e8d84383f7d040c2df13e8ea"
SRC_URI[sha256sum] = "12bd46ee7ec25b291ea139b17aa991e7ef373e21abd053949b75c0e9ca55c632"

S = "${WORKDIR}/geographiclib-1.50"

RDEPENDS_${PN} = ""

inherit setuptools3

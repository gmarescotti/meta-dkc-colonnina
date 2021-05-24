
SUMMARY = "Netjsonconfig is a python library that converts NetJSON DeviceConfiguration objects into real router configurations that can be installed on systems like OpenWRT or OpenWisp Firmware."
HOMEPAGE = "http://netjsonconfig.openwisp.org"
AUTHOR = "Federico Capoano <federico.capoano@gmail.com>"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ed18e26b0a7b5735d0d188efd802f8a2"

SRC_URI = "https://files.pythonhosted.org/packages/f7/f2/dfebefca14b73ed13a0b24b64ab8a8b43dd29413aaa776f170df5162ef63/netjsonconfig-0.9.1.tar.gz"
SRC_URI[md5sum] = "be0da1f56d58de702f7f8bcacd89ece5"
SRC_URI[sha256sum] = "7a053067e6b08d083813287724417753c1f5171980b78f7bc35fe5daab7a60f1"

S = "${WORKDIR}/netjsonconfig-0.9.1"

RDEPENDS_${PN} = "python3-jinja2 python3-jsonschema python3-six"

inherit setuptools3
